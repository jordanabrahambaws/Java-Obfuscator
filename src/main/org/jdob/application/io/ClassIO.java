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

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

/**
 * @author Jordan Abraham <jordan.abraham1997@gmail.com>
 */
public final class ClassIO {

	/**
	 * The constructed {@link ClassReader} that is parsed after the input file is read.
	 */
	private final ClassReader reader;

	/**
	 * The constructed {@link ClassWriter} that is parsed after the input file is read.
	 */
	private final ClassWriter writer;

	/**
	 * Constructs a new object.
	 * @param reader The class reader.
	 * @param writer The class writer.
	 */
	public ClassIO(ClassReader reader, ClassWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	/**
	 * Gets the reader.
	 * @return the reader
	 */
	public ClassReader getReader() {
		return reader;
	}

	/**
	 * Gets the writer.
	 * @return the writer
	 */
	public ClassWriter getWriter() {
		return writer;
	}

}
