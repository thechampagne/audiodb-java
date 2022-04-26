/*
 * Copyright 2022 XXIV
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.thexxiv.audiodb;

import java.util.ArrayList;

public class Track{
    public String idTrack;
    public String idAlbum;
    public String idArtist;
    public String idLyric;
    public String idIMVDB;
    public String strTrack;
    public String strAlbum;
    public String strArtist;
    public String strArtistAlternate;
    public String intCD;
    public String intDuration;
    public String strGenre;
    public String strMood;
    public String strStyle;
    public String strTheme;
    public String strDescriptionEN;
    public String strDescriptionDE;
    public String strDescriptionFR;
    public String strDescriptionCN;
    public String strDescriptionIT;
    public String strDescriptionJP;
    public String strDescriptionRU;
    public String strDescriptionES;
    public String strDescriptionPT;
    public String strDescriptionSE;
    public String strDescriptionNL;
    public String strDescriptionHU;
    public String strDescriptionNO;
    public String strDescriptionIL;
    public String strDescriptionPL;
    public String strTrackThumb;
    public String strTrack3DCase;
    public String strTrackLyrics;
    public String strMusicVid;
    public String strMusicVidDirector;
    public String strMusicVidCompany;
    public String strMusicVidScreen1;
    public String strMusicVidScreen2;
    public String strMusicVidScreen3;
    public String intMusicVidViews;
    public String intMusicVidLikes;
    public String intMusicVidDislikes;
    public String intMusicVidFavorites;
    public String intMusicVidComments;
    public String intTrackNumber;
    public String intLoved;
    public String intScore;
    public String intScoreVotes;
    public String intTotalListeners;
    public String intTotalPlays;
    public String strMusicBrainzID;
    public String strMusicBrainzAlbumID;
    public String strMusicBrainzArtistID;
    public String strLocked;

    @Override
    public String toString() {
        return "Track{" +
                "idTrack='" + idTrack + '\'' +
                ", idAlbum='" + idAlbum + '\'' +
                ", idArtist='" + idArtist + '\'' +
                ", idLyric='" + idLyric + '\'' +
                ", idIMVDB='" + idIMVDB + '\'' +
                ", strTrack='" + strTrack + '\'' +
                ", strAlbum='" + strAlbum + '\'' +
                ", strArtist='" + strArtist + '\'' +
                ", strArtistAlternate='" + strArtistAlternate + '\'' +
                ", intCD='" + intCD + '\'' +
                ", intDuration='" + intDuration + '\'' +
                ", strGenre='" + strGenre + '\'' +
                ", strMood='" + strMood + '\'' +
                ", strStyle='" + strStyle + '\'' +
                ", strTheme='" + strTheme + '\'' +
                ", strDescriptionEN='" + strDescriptionEN + '\'' +
                ", strDescriptionDE='" + strDescriptionDE + '\'' +
                ", strDescriptionFR='" + strDescriptionFR + '\'' +
                ", strDescriptionCN='" + strDescriptionCN + '\'' +
                ", strDescriptionIT='" + strDescriptionIT + '\'' +
                ", strDescriptionJP='" + strDescriptionJP + '\'' +
                ", strDescriptionRU='" + strDescriptionRU + '\'' +
                ", strDescriptionES='" + strDescriptionES + '\'' +
                ", strDescriptionPT='" + strDescriptionPT + '\'' +
                ", strDescriptionSE='" + strDescriptionSE + '\'' +
                ", strDescriptionNL='" + strDescriptionNL + '\'' +
                ", strDescriptionHU='" + strDescriptionHU + '\'' +
                ", strDescriptionNO='" + strDescriptionNO + '\'' +
                ", strDescriptionIL='" + strDescriptionIL + '\'' +
                ", strDescriptionPL='" + strDescriptionPL + '\'' +
                ", strTrackThumb='" + strTrackThumb + '\'' +
                ", strTrack3DCase='" + strTrack3DCase + '\'' +
                ", strTrackLyrics='" + strTrackLyrics + '\'' +
                ", strMusicVid='" + strMusicVid + '\'' +
                ", strMusicVidDirector='" + strMusicVidDirector + '\'' +
                ", strMusicVidCompany='" + strMusicVidCompany + '\'' +
                ", strMusicVidScreen1='" + strMusicVidScreen1 + '\'' +
                ", strMusicVidScreen2='" + strMusicVidScreen2 + '\'' +
                ", strMusicVidScreen3='" + strMusicVidScreen3 + '\'' +
                ", intMusicVidViews='" + intMusicVidViews + '\'' +
                ", intMusicVidLikes='" + intMusicVidLikes + '\'' +
                ", intMusicVidDislikes='" + intMusicVidDislikes + '\'' +
                ", intMusicVidFavorites='" + intMusicVidFavorites + '\'' +
                ", intMusicVidComments='" + intMusicVidComments + '\'' +
                ", intTrackNumber='" + intTrackNumber + '\'' +
                ", intLoved='" + intLoved + '\'' +
                ", intScore='" + intScore + '\'' +
                ", intScoreVotes='" + intScoreVotes + '\'' +
                ", intTotalListeners='" + intTotalListeners + '\'' +
                ", intTotalPlays='" + intTotalPlays + '\'' +
                ", strMusicBrainzID='" + strMusicBrainzID + '\'' +
                ", strMusicBrainzAlbumID='" + strMusicBrainzAlbumID + '\'' +
                ", strMusicBrainzArtistID='" + strMusicBrainzArtistID + '\'' +
                ", strLocked='" + strLocked + '\'' +
                '}';
    }
}

class BaseTrack{
    ArrayList<Track> track;
}