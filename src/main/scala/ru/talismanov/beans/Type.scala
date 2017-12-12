package ru.talismanov.beans

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty
//remove if not needed

class Type {

  @SerializedName("id")
  @Expose
  @BeanProperty
  var id: String = _

  @SerializedName("name")
  @Expose
  @BeanProperty
  var name: String = _
}
