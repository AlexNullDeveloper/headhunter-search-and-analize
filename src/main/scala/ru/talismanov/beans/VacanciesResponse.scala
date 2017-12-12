package ru.talismanov.beans

import java.util
import java.util.List

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty
//remove if not needed

class VacanciesResponse {

  @SerializedName("clusters")
  @Expose
  @BeanProperty
  var clusters: AnyRef = _

  @SerializedName("items")
  @Expose
  @BeanProperty
  var items: util.List[Item] = null

  @SerializedName("pages")
  @Expose
  @BeanProperty
  var pages: java.lang.Integer = _

  @SerializedName("arguments")
  @Expose
  @BeanProperty
  var arguments: AnyRef = _

  @SerializedName("found")
  @Expose
  @BeanProperty
  var found: java.lang.Integer = _

  @SerializedName("alternate_url")
  @Expose
  @BeanProperty
  var alternateUrl: String = _

  @SerializedName("per_page")
  @Expose
  @BeanProperty
  var perPage: java.lang.Integer = _

  @SerializedName("page")
  @Expose
  @BeanProperty
  var page: java.lang.Integer = _

  @SerializedName("key_skills")
  @Expose
  @BeanProperty
  var keySkills: List[KeySkill] = null
}
