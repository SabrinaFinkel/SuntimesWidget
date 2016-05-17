/**
    Copyright (C) 2014 Forrest Guice
    This file is part of SuntimesWidget.

    SuntimesWidget is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    SuntimesWidget is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with SuntimesWidget.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.forrestguice.suntimeswidget.notes;

import android.util.Log;

import com.forrestguice.suntimeswidget.SuntimesUtils;
import com.forrestguice.suntimeswidget.settings.SolarEvents;

import java.util.Date;

public class NoteData
{
    public SolarEvents noteMode;
    public SuntimesUtils.TimeDisplayText timeText;
    public String prefixText;
    public String noteText;
    public int noteIconResource;
    public int noteColor;
    public Date time;

    public NoteData(SolarEvents noteMode, SuntimesUtils.TimeDisplayText timeText, String prefixText, String noteText, int noteIconResource, int noteColor)
    {
        this.noteMode = noteMode;
        this.timeText = timeText;
        this.prefixText = prefixText;
        this.noteText = noteText;
        this.noteIconResource = noteIconResource;
        this.noteColor = noteColor;
    }

    public NoteData( NoteData other )
    {
        this.noteMode = other.noteMode;
        this.timeText = other.timeText;
        this.prefixText = other.prefixText;
        this.noteText = other.noteText;
        this.noteIconResource = other.noteIconResource;
        this.noteColor = other.noteColor;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !NoteData.class.isAssignableFrom(obj.getClass()))
            return false;

        final NoteData other = (NoteData) obj;
        if (other.noteMode != noteMode)
            return false;

        if (!other.timeText.getValue().equals(timeText.getValue()))
            return false;

        //Log.d("NoteData.equals", "these notes are the same");
        return true;
    }

    @Override
    public String toString()
    {
        return "NoteData[" + this.noteMode + " (" + this.time + " in" + timeText + ")" + "]";
    }
}
