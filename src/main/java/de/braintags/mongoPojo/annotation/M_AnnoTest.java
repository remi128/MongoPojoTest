package de.braintags.mongoPojo.annotation;

import java.util.Arrays;

public class M_AnnoTest {

  public M_AnnoTest() {
  }

  public static void main(String[] args) {
    Resources resources = ResourceReader.getInitializedResourcesFor(Resources.class);
    System.out.println(resources.now);
    System.out.println(Arrays.toString(resources.files));
    System.out.println(resources.testFile);
  }

}
