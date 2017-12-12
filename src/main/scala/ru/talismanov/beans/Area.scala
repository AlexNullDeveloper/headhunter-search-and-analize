package ru.talismanov.beans

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty

class Area {

  @SerializedName("url")
  @Expose
  @BeanProperty
  var url: String = _

  @SerializedName("id")
  @Expose
  @BeanProperty
  var id: String = _

  @SerializedName("name")
  @Expose
  @BeanProperty
  var name: String = _
}
