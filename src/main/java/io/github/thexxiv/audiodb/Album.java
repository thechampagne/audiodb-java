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

public class Album{
    public String idAlbum;
    public String idArtist;
    public String idLabel;
    public String strAlbum;
    public String strAlbumStripped;
    public String strArtist;
    public String strArtistStripped;
    public String intYearReleased;
    public String strStyle;
    public String strGenre;
    public String strLabel;
    public String strReleaseFormat;
    public String intSales;
    public String strAlbumThumb;
    public String strAlbumThumbHQ;
    public String strAlbumThumbBack;
    public String strAlbumCDart;
    public String strAlbumSpine;
    public String strAlbum3DCase;
    public String strAlbum3DFlat;
    public String strAlbum3DFace;
    public String strAlbum3DThumb;
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
    public String intLoved;
    public String intScore;
    public String intScoreVotes;
    public String strReview;
    public String strMood;
    public String strTheme;
    public String strSpeed;
    public String strLocation;
    public String strMusicBrainzID;
    public String strMusicBrainzArtistID;
    public String strAllMusicID;
    public String strBBCReviewID;
    public String strRateYourMusicID;
    public String strDiscogsID;
    public String strWikidataID;
    public String strWikipediaID;
    public String strGeniusID;
    public String strLyricWikiID;
    public String strMusicMozID;
    public String strItunesID;
    public String strAmazonID;
    public String strLocked;
    public String strDescription;

    @Override
    public String toString() {
        return "Album{" +
                "idAlbum='" + idAlbum + '\'' +
                ", idArtist='" + idArtist + '\'' +
                ", idLabel='" + idLabel + '\'' +
                ", strAlbum='" + strAlbum + '\'' +
                ", strAlbumStripped='" + strAlbumStripped + '\'' +
                ", strArtist='" + strArtist + '\'' +
                ", strArtistStripped='" + strArtistStripped + '\'' +
                ", intYearReleased='" + intYearReleased + '\'' +
                ", strStyle='" + strStyle + '\'' +
                ", strGenre='" + strGenre + '\'' +
                ", strLabel='" + strLabel + '\'' +
                ", strReleaseFormat='" + strReleaseFormat + '\'' +
                ", intSales='" + intSales + '\'' +
                ", strAlbumThumb='" + strAlbumThumb + '\'' +
                ", strAlbumThumbHQ='" + strAlbumThumbHQ + '\'' +
                ", strAlbumThumbBack='" + strAlbumThumbBack + '\'' +
                ", strAlbumCDart='" + strAlbumCDart + '\'' +
                ", strAlbumSpine='" + strAlbumSpine + '\'' +
                ", strAlbum3DCase='" + strAlbum3DCase + '\'' +
                ", strAlbum3DFlat='" + strAlbum3DFlat + '\'' +
                ", strAlbum3DFace='" + strAlbum3DFace + '\'' +
                ", strAlbum3DThumb='" + strAlbum3DThumb + '\'' +
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
                ", intLoved='" + intLoved + '\'' +
                ", intScore='" + intScore + '\'' +
                ", intScoreVotes='" + intScoreVotes + '\'' +
                ", strReview='" + strReview + '\'' +
                ", strMood='" + strMood + '\'' +
                ", strTheme='" + strTheme + '\'' +
                ", strSpeed='" + strSpeed + '\'' +
                ", strLocation='" + strLocation + '\'' +
                ", strMusicBrainzID='" + strMusicBrainzID + '\'' +
                ", strMusicBrainzArtistID='" + strMusicBrainzArtistID + '\'' +
                ", strAllMusicID='" + strAllMusicID + '\'' +
                ", strBBCReviewID='" + strBBCReviewID + '\'' +
                ", strRateYourMusicID='" + strRateYourMusicID + '\'' +
                ", strDiscogsID='" + strDiscogsID + '\'' +
                ", strWikidataID='" + strWikidataID + '\'' +
                ", strWikipediaID='" + strWikipediaID + '\'' +
                ", strGeniusID='" + strGeniusID + '\'' +
                ", strLyricWikiID='" + strLyricWikiID + '\'' +
                ", strMusicMozID='" + strMusicMozID + '\'' +
                ", strItunesID='" + strItunesID + '\'' +
                ", strAmazonID='" + strAmazonID + '\'' +
                ", strLocked='" + strLocked + '\'' +
                ", strDescription='" + strDescription + '\'' +
                '}';
    }
}

class BaseAlbum{
    ArrayList<Album> album;
}