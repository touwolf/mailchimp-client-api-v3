package com.touwolf.mailchimp.model.list.data.members;

import com.google.gson.annotations.SerializedName;

public class ListsMembersLastNote
{
    @SerializedName("note_id")
    private Integer noteId;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("created_by")
    private String createdBy;

    private String note;

    /**
     * The note id.
     *
     */
    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    /**
     * The date and time the note was created.
     *
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The author of the note.
     *
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * The content of the note.
     *
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
