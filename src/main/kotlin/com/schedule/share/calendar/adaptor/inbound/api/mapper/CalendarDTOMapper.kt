package com.schedule.share.calendar.adaptor.inbound.api.mapper

import com.schedule.share.calendar.adaptor.inbound.api.dto.CalendarRequestDTO
import com.schedule.share.calendar.adaptor.inbound.api.dto.CalendarResponseDTO
import com.schedule.share.calendar.application.service.calendar.vo.CalendarVO

fun CalendarRequestDTO.Calendar.toVO(
    createdBy: Long,
    image: ByteArray,
    userId: Long
): CalendarVO.Save =
    CalendarVO.Save(
        isPublic = isPublic,
        title = title,
        content = content,
        image = image,
        createdBy = createdBy,
        userId = userId
    )


fun CalendarVO.Calendar.toResponse(): CalendarResponseDTO.Response =
    CalendarResponseDTO.Response(
        id = id!!,
        userId = userId,
        isPublic = isPublic,
        title = title,
        content = content,
        image = image,
        createdBy = createdBy,
        createdAt = createdAt!!,
        modifiedAt = modifiedAt!!,
        isDeleted = isDeleted
    )