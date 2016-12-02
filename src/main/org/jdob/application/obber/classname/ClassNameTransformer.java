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

package main.org.jdob.application.obber.classname;

import org.objectweb.asm.ClassVisitor;

import main.org.jdob.application.io.ClassIO;
import main.org.jdob.application.io.FileStream;
import main.org.jdob.application.obber.Transformer;

/**
 * @author Jordan Abraham <jordan.abraham1997@gmail.com>
 */
public final class ClassNameTransformer extends Transformer {

	/**
	 * Constructs a new object.
	 * @param fileStream This is the {@link FileStream} created with the input file.
	 * @param classVisitor The {@link ClassVisitor} used along with the {@link ClassIO}.
	 */
	public ClassNameTransformer(FileStream fileStream, ClassVisitor classVisitor) {
		super(fileStream, classVisitor);
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		super.read();
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
	}

}
