package com.aritra.notify.utils

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import com.aritra.notify.reciever.ReminderNoteNotificationBroadcast


fun getNoteAlarmPendingIntent(
    context: Context,
    id: Int,
    flag: Int = PendingIntent.FLAG_UPDATE_CURRENT,
): PendingIntent? {
    return PendingIntent.getBroadcast(
        context,
        id,
        Intent(context, ReminderNoteNotificationBroadcast::class.java).apply {
            putExtra("noteID", id)
        },
        flag or PendingIntent.FLAG_IMMUTABLE
    )
}