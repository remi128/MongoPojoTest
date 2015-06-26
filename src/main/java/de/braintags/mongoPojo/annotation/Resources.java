package de.braintags.mongoPojo.annotation;

import java.util.Date;

/**
 * <br>
 * <br>
 * Copyright: Copyright (c) 26.06.2015 <br>
 * Company: Braintags GmbH <br>
 * 
 * @author mremme
 * 
 */

public class Resources {

  @CurrentDateResource()
  public Date now;

  @ListOfFilesResource(value = "c:/")
  public String[] files;

  @UrlResource("http://tutego.de/aufgaben/bond.txt")
  public String testFile;
}
