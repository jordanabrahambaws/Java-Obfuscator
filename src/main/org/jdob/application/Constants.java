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

package main.org.jdob.application;

/**
 * @author Jordan Abraham <jordan.abraham1997@gmail.com>
 */
public final class Constants {

	/**
	 * The directory for the repository for which server data can be found.
	 */
	public static final String REPOSITORY_DIRECTORY = "./repo/";

	/**
	 * The set name of the input file should be. This is specific because we need to keep a constant so random
	 * files aren't attempted for obfuscation.
	 */
	public static final String INPUT_FILE = "input";

	/**
	 * The set name of the output file.
	 */
	public static final String OUTPUT_FILE = "output";

	/**
	 * The allowed extension of the input and output files.
	 */
	public static final String ALLOWED_EXTENSION = ".jar";

}
