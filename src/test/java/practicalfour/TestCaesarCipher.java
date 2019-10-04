package practicalfour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import practicalfour.CaesarCipher;

/**
 * A JUnit test suite for the CaesarCipher.
 *
 * @author Gregory M. Kapfhammer
 */

public class TestCaesarCipher {

  /** The sentence used for testing. */
  private static String SENTENCE = "THE EAGLE IS IN PLAY; MEET AT JOE'S AT 2:00 PM.";

  /** A small shift for the letters. */
  private static int SMALL_SHIFT = 2;

  /** A big shift for the letters. */
  private static int BIG_SHIFT = 10;

  /** A gigantic (full)-shift for the letters. */
  private static int GIGANTIC_SHIFT = 26;

  @Test
  public void testEncryptAndDecryptSentenceSmall() {
    String plaintext = SENTENCE;
    CaesarCipher cipher = new CaesarCipher(SMALL_SHIFT);
    String ciphertext = cipher.encrypt(plaintext);
    String ciphertextDecrypted = cipher.decrypt(ciphertext);
    assertEquals(plaintext, ciphertextDecrypted);
  }

  @Test
  public void testEncryptAndDecryptSentenceBig() {
    String plaintext = SENTENCE;
    CaesarCipher cipher = new CaesarCipher(BIG_SHIFT);
    String ciphertext = cipher.encrypt(plaintext);
    String ciphertextDecrypted = cipher.decrypt(ciphertext);
    assertEquals(plaintext, ciphertextDecrypted);
  }

  @Test
  public void testEncryptAndDecryptSentenceGigantic() {
    String plaintext = SENTENCE;
    CaesarCipher cipher = new CaesarCipher(GIGANTIC_SHIFT);
    String ciphertext = cipher.encrypt(plaintext);
    String ciphertextDecrypted = cipher.decrypt(ciphertext);
    assertEquals(plaintext, ciphertextDecrypted);
  }

}
