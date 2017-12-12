package ru.talismanov.beans

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty
//remove if not needed

class LogoUrls {

  @SerializedName("90")
  @Expose
  @BeanProperty
  var ninety: String = _

  @SerializedName("240")
  @Expose
  @BeanProperty
  var twoHungreadFourty: String = _

  @SerializedName("original")
  @Expose
  @BeanProperty
  var original: String = _
}
