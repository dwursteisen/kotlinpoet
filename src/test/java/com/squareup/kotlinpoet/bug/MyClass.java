package com.squareup.kotlinpoet.bug;

import javax.xml.bind.annotation.XmlSeeAlso;


@XmlSeeAlso({
    Object.class, Boolean.class
})
public class MyClass {


}
