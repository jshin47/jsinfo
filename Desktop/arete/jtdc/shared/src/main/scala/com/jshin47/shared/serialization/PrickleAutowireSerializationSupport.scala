package com.jshin47.shared.serialization

/**
  * Created by justin on 5/7/16.
  */
import prickle._

trait PrickleAutowireSerializationSupport extends autowire.Serializers[String, Unpickler, Pickler] with PrickleExtras {
  def read[R: Unpickler](p: String) = Unpickle[R].fromString(p).get
  def write[R: Pickler](r: R) = Pickle.intoString[R](r)
}