package exercise;

import java.io.File;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
  private String storagePath;

  public FileKV(String path, Map<String, String> dictionary) {
    this.storagePath = path;
    Utils.writeFile(path, Utils.serialize(dictionary));
  }

  private String getStoragePath() {
    return storagePath;
  }

  public void set(String key, String value) {
    var dictionary = Utils.unserialize(Utils.readFile(getStoragePath()));
    dictionary.put(key, value);
    Utils.writeFile(getStoragePath(), Utils.serialize(dictionary));
  }

  public void unset(String key) {
    var dictionary = Utils.unserialize(Utils.readFile(getStoragePath()));
    dictionary.remove(key);
    Utils.writeFile(getStoragePath(), Utils.serialize(dictionary));
  }

  public String get(String key, String defaultValue) {
    var dictionary = Utils.unserialize(Utils.readFile(getStoragePath()));
    return dictionary.getOrDefault(key, defaultValue);
  }

  public Map<String, String> toMap() {
    return Utils.unserialize(Utils.readFile(getStoragePath()));
  }
}
// END
