package com.schedule.share.calendar.application.service.calendar.vo

import java.time.LocalDateTime

class CalendarVO {

    data class Calendar(
        val id: Long? = null,
        val userId: Long,
        val isPublic: Boolean = false,
        val title: String,
        val content: String? = null,
        val image: ByteArray? = null,
        val createdBy: Long? = null,
        val createdAt: LocalDateTime? = null,
        val modifiedAt: LocalDateTime? = null,
        val isDeleted: Boolean = false
    )

    data class Save(
        val isPublic: Boolean = false,
        val userId: Long,
        val title: String,
        val content: String,
        val image: ByteArray? = null,
        val createdBy: Long
    )
}