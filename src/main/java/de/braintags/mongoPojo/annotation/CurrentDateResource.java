package de.braintags.mongoPojo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <br>
 * <br>
 * Copyright: Copyright (c) 26.06.2015 <br>
 * Company: Braintags GmbH <br>
 * 
 * @author mremme
 * 
 */

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentDateResource {

}
