package ru.talismanov.beans

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty
//remove if not needed

class KeySkill {

  @SerializedName("name")
  @Expose
  @BeanProperty
  var name: String = _
}