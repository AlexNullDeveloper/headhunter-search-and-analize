package ru.talismanov.beans

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty
//remove if not needed

class Snippet {

  @SerializedName("requirement")
  @Expose
  @BeanProperty
  var requirement: String = _

  @SerializedName("responsibility")
  @Expose
  @BeanProperty
  var responsibility: String = _
}
