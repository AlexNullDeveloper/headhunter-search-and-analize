package ru.talismanov.beans

import java.util.List

import com.google.gson.annotations.{Expose, SerializedName}

import scala.beans.BeanProperty

class Item {

  @SerializedName("salary")
  @Expose
  @BeanProperty
  var salary: AnyRef = _

  @SerializedName("snippet")
  @Expose
  @BeanProperty
  var snippet: Snippet = _

  @SerializedName("archived")
  @Expose
  @BeanProperty
  var archived: java.lang.Boolean = _

  @SerializedName("premium")
  @Expose
  @BeanProperty
  var premium: java.lang.Boolean = _

  @SerializedName("name")
  @Expose
  @BeanProperty
  var name: String = _

  @SerializedName("area")
  @Expose
  @BeanProperty
  var area: Area = _

  @SerializedName("url")
  @Expose
  @BeanProperty
  var url: String = _

  @SerializedName("created_at")
  @Expose
  @BeanProperty
  var createdAt: String = _

  @SerializedName("alternate_url")
  @Expose
  @BeanProperty
  var alternateUrl: String = _

  @SerializedName("apply_alternate_url")
  @Expose
  @BeanProperty
  var applyAlternateUrl: String = _

  @SerializedName("relations")
  @Expose
  @BeanProperty
  var relations: List[Any] = null

  @SerializedName("employer")
  @Expose
  @BeanProperty
  var employer: Employer = _

  @SerializedName("response_letter_required")
  @Expose
  @BeanProperty
  var responseLetterRequired: java.lang.Boolean = _

  @SerializedName("published_at")
  @Expose
  @BeanProperty
  var publishedAt: String = _

  @SerializedName("address")
  @Expose
  @BeanProperty
  var address: AnyRef = _

  @SerializedName("department")
  @Expose
  @BeanProperty
  var department: AnyRef = _

  @SerializedName("sort_point_distance")
  @Expose
  @BeanProperty
  var sortPointDistance: AnyRef = _

  @SerializedName("type")
  @Expose
  @BeanProperty
  var `type`: Type = _

  @SerializedName("id")
  @Expose
  @BeanProperty
  var id: String = _
}
