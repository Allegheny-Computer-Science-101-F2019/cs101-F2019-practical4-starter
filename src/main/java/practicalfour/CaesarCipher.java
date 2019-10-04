package practicalfour;

/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/** Class for doing encryption and decryption using the Caesar Cipher. */
public class CaesarCipher {

  // TODO: Can you think of a way to avoid using the number 26 repeatedly?

  /** The array used for encryption. */
  protected char[] encoder = new char[26];

  /** The array used for decryption. **/
  protected char[] decoder = new char[26];

  public CaesarCipher(int rotation) {
    // TODO: Make sure that you understand how and why
    // this constructor uses modular arithmetic
    // TODO: Make sure that you understand why the encoder
    // uses addition and the decoder uses subtraction
    for (int k = 0; k < 26; k++) {
      encoder[k] = (char) ('A' + (k + rotation) % 26);
      decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
    }
  }

  public String encrypt(String message) {
    // use the encoder array
    // TODO: Add the additional line of required code
    // TODO: Make sure that you understand how this line of code works!
    return "FINISH THIS METHOD!";
  }

  public String decrypt(String secret) {
    // use the encoder array
    // TODO: Add the additional line of required code
    // TODO: Make sure that you understand how this line of code works!
    return "FINISH THIS METHOD!";
  }

  private String transform(String original, char[] code) {
    // TODO: convert the original string to an array of characters
    // TODO: Add all of the required code
    return new String("");
  }

  public static void main(String[] args) {
    CaesarCipher cipher = new CaesarCipher(3);
    System.out.println("Encryption code = " + new String(cipher.encoder));
    System.out.println("Decryption code = " + new String(cipher.decoder));
    String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S AT 2:00 PM.";
    // TODO: Add the remaining code to produce the requested output
  }
}
