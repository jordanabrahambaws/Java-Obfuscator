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

package main.org.jdob.application.obber;

import org.objectweb.asm.ClassVisitor;

import jdk.internal.org.objectweb.asm.Opcodes;
import main.org.jdob.application.io.ClassIO;
import main.org.jdob.application.io.FileStream;

/**
 * @author Jordan Abraham <jordan.abraham1997@gmail.com>
 */
public class Transformer extends ClassVisitor {

	/**
	 * The {@link FileStream} used in each obfuscation technique. We use it to perform, I/O operations within
	 * each implemented obber technique.
	 */
	private final FileStream fileStream;

	/**
	 * Constructs a new object.
	 * @param fileStream This is the {@link FileStream} created with the input file.
	 * @param classVisitor The {@link ClassVisitor} used along with the {@link ClassIO}.
	 */
	public Transformer(FileStream fileStream, ClassVisitor classVisitor) {
		super(Opcodes.ASM5, classVisitor);
		this.fileStream = fileStream;
	}

	/**
	 * Reads the class data.
	 */
	public void read() {

	}

	/**
	 * Writes the class data.
	 */
	public void write() {

	}

	/**
	 * Gets the fileStream.
	 * @return the fileStream
	 */
	public FileStream getFileStream() {
		return fileStream;
	}

}
