package ru.talismanov.beans

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty

class Employer {

  @SerializedName("logo_urls")
  @Expose
  @BeanProperty
  var logoUrls: LogoUrls = _

  @SerializedName("vacancies_url")
  @Expose
  @BeanProperty
  var vacanciesUrl: String = _

  @SerializedName("name")
  @Expose
  @BeanProperty
  var name: String = _

  @SerializedName("url")
  @Expose
  @BeanProperty
  var url: String = _

  @SerializedName("alternate_url")
  @Expose
  @BeanProperty
  var alternateUrl: String = _

  @SerializedName("id")
  @Expose
  @BeanProperty
  var id: String = _

  @SerializedName("trusted")
  @Expose
  @BeanProperty
  var trusted: java.lang.Boolean = _
}
