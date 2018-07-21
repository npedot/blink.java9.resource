package it.nipe.java9;

class ResourceLoader {

  public static void main(String[] args) {
    String url = ResourceLoader.class.getClassLoader().getResource("test.txt").toExternalForm();
    String javaVersion = System.getProperty("java.version");
    System.out.println("Java version:"+javaVersion);
    System.out.println(url);
  }

}