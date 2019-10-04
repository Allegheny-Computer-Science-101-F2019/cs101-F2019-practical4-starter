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

  /** The array used for encryption. */
  protected char[] encoder = new char[26];

  /** The array used for decryption. **/
  protected char[] decoder = new char[26];

  /** Constructor that initializes the encryption and decryption arrays. */
  public CaesarCipher(int rotation) {
    for (int k = 0; k < 26; k++) {
      encoder[k] = (char) ('A' + (k + rotation) % 26);
      decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
    }
  }

  /** Returns String representing encrypted message. */
  public String encrypt(String message) {
    // use the encoder array
    return transform(message, encoder);
  }

  /** Returns decrypted message given encrypted secret. */
  public String decrypt(String secret) {
    // use the decoder array
    return transform(secret, decoder);
  }

  /** Returns transformation of original String using given code. */
  private String transform(String original, char[] code) {
    char[] msg = original.toCharArray();
    for (int k = 0; k < msg.length; k++) {
      if (Character.isUpperCase(msg[k])) {
        int changed = msg[k] - 'A';
        msg[k] = code[changed];
      }
    }
    return new String(msg);
  }

  /** Simple main method for demonstrating the Caesar cipher. */
  public static void main(String[] args) {
    CaesarCipher cipher = new CaesarCipher(3);
    System.out.println("Encryption code = " + new String(cipher.encoder));
    System.out.println("Decryption code = " + new String(cipher.decoder));
    String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S AT 2:00 PM.";
    String coded = cipher.encrypt(message);
    System.out.println("Secret:  " + coded);
    String answer = cipher.decrypt(coded);
    System.out.println("Message: " + answer);
  }
}
