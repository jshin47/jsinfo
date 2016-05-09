package com.jshin47.jtdc.client.state

import com.jshin47.jtdc.dto.{Post, PostId}

case object InitializePosts
case class AddPost(title: String, post: String, author: String = "Anonymous")
case class UpdatePost(id: PostId, title: Option[String], content: Option[String])
case class DeletePost(id: PostId)
case object Refresh
case class FindByTitle(title: String)

sealed abstract case class PostFilter(link: String, title: String, predicate: Post ⇒ Boolean)
object PostFilter {
  object All extends PostFilter("", "All", _ ⇒ true)
  object AnonymousAuthor extends PostFilter("anon", "Anonymous Authorship", p ⇒ p.author.equalsIgnoreCase("anonymous"))
  val values = List[PostFilter](All, AnonymousAuthor)
}

case class SelectFilter(filter: PostFilter)