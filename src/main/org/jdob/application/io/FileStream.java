/**Copyright (C) 2016 JDOB

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package main.org.jdob.application.io;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import main.org.jdob.application.obber.Transformer;

/**
 * @author Jordan Abraham <jordan.abraham1997@gmail.com>
 */
public final class FileStream {

	/**
	 * This is the stored jar file that is being obfuscated.
	 */
	private final JarFile jarFile;

	/**
	 * Represents a {@link HashBasedTable} of transformers that are taken from the input file.
	 */
	private final Table<String, ClassIO, ClassVisitor> transformers = HashBasedTable.create();

	/**
	 * Constructs a new object.
	 * @param file The file used to create a new instance of {@link JarFile}.
	 * @throws IOException Thrown if there is an error in the I/O operation.
	 */
	public FileStream(File file) throws IOException {
		this.jarFile = new JarFile(file);
	}

	/**
	 * Parses the transformers for the obfuscater.
	 * @throws IOException Thrown if there is an error in the I/O operation.
	 */
	public void parseTransformers() throws IOException {
		Stream<JarEntry> stream = jarFile.stream().filter(a -> a.getName().endsWith(".class"));
		Iterator<JarEntry> it = stream.iterator();
		while (it.hasNext()) {
			JarEntry entry = it.next();
			if (entry == null) {
				continue;
			}

			ClassReader reader = new ClassReader(jarFile.getInputStream(entry));
			ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_FRAMES);
			ClassVisitor visitor = new Transformer(this, writer);
			ClassIO io = new ClassIO(reader, writer);

			transformers.put(entry.getName(), io, visitor);
		}
	}

	/**
	 * Gets the jarFile.
	 * @return the jarFile
	 */
	public JarFile getJarFile() {
		return jarFile;
	}

	/**
	 * Gets the transformers.
	 * @return the transformers
	 */
	public Table<String, ClassIO, ClassVisitor> getTransformers() {
		return transformers;
	}

}
