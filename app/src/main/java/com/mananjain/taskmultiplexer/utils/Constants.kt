package com.mananjain.taskmultiplexer.utils

import android.app.Activity
import android.net.Uri
import android.webkit.MimeTypeMap

object Constants {

    const val USERS: String = "users"

    const val BOARDS: String = "boards"
    const val IMAGE: String = "image"
    const val NAME: String = "name"
    const val MOBILE: String = "mobile"
    const val ASSIGNED_TO : String = "assignedTo"
    const val DOCUMENT_ID: String = "documentId"
    const val TASK_LIST: String = "taskList"
    const val BOARD_DETAIL: String = "board_detail"
    const val ID: String = "id"
    const val EMAIL: String = "email"
    const val TASK_LIST_ITEM_POSITION: String = "task_list_item_position"
    const val CARD_LIST_ITEM_POSITION: String = "card_list_item_position"
    const val BOARD_MEMBERS_LIST: String = "board_members_list"
    const val SELECT: String = "Select"
    const val UN_SELECT: String = "UnSelect"
    const val PROJEMANAG_PREFERENCES = "projemanagPrefs"
    const val FCM_TOKEN_UPDATED = "fcmTokenUpdated"
    const val FCM_TOKEN = "fcmToken"

    const val FCM_BASE_URL:String = "https://fcm.googleapis.com/fcm/send"
    const val FCM_AUTHORIZATION:String = "authorization"
    const val FCM_KEY:String = "key"
    const val FCM_SERVER_KEY:String = "AAAAbWKP-yI:APA91bEeyH40kln0CLQCh2prq25voicGTlpUaEO_vE0JPU3SyneV1uumpGGiQffoQqmZ9-FO0WnV0QkQ5zJBxvdELBiXaOnDN65V4VlId_DeVckAIhvPmas-iKQ1OxmH1hVo3GHoqe_m"
    const val FCM_KEY_TITLE:String = "title"
    const val FCM_KEY_MESSAGE:String = "message"
    const val FCM_KEY_DATA:String = "data"
    const val FCM_KEY_TO:String = "to"

    fun getFileExtension(activity:Activity,uri: Uri?): String?{
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(
            activity.contentResolver.getType(uri!!)
        )
    }

}