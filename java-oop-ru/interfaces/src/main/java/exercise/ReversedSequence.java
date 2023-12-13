package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
  char[] chars;

  public ReversedSequence(String string) {
    int stringLength = string.length();

    this.chars = new char[stringLength];
    for (int i = 0; i < string.length(); i += 1) {
      this.chars[i] = string.charAt(stringLength - i - 1);
    }
  }

  @Override
  public int length() {
    return chars.length;
  }

  @Override
  public char charAt(int index) {
    return chars[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return new ReversedSequence(new String(chars).substring(start, end));
  }

  @Override
  public String toString() {
    return new String(chars);
  }
}
// END
