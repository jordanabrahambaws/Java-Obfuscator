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
package main.org.jdob;

import java.io.File;
import java.io.IOException;

import main.org.jdob.application.Constants;
import main.org.jdob.application.io.FileStream;

/**
 * @author Jordan Abraham <jordan.abraham1997@gmail.com>
 */
public final class JDOB {

	/**
	 * Starts the application.
	 * @param args Runtime arguments.
	 */
	public static void main(String[] args) {
		try {
			File file = new File(Constants.REPOSITORY_DIRECTORY + "/" + Constants.INPUT_FILE + Constants.ALLOWED_EXTENSION);
			FileStream stream = new FileStream(file);
			stream.parseTransformers();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
