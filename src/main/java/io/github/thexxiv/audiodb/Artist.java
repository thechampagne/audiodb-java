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

public class Artist{
    public String idArtist;
    public String strArtist;
    public String strArtistStripped;
    public String strArtistAlternate;
    public String strLabel;
    public String idLabel;
    public String intFormedYear;
    public String intBornYear;
    public String intDiedYear;
    public String strDisbanded;
    public String strStyle;
    public String strGenre;
    public String strMood;
    public String strWebsite;
    public String strFacebook;
    public String strTwitter;
    public String strBiographyEN;
    public String strBiographyDE;
    public String strBiographyFR;
    public String strBiographyCN;
    public String strBiographyIT;
    public String strBiographyJP;
    public String strBiographyRU;
    public String strBiographyES;
    public String strBiographyPT;
    public String strBiographySE;
    public String strBiographyNL;
    public String strBiographyHU;
    public String strBiographyNO;
    public String strBiographyIL;
    public String strBiographyPL;
    public String strGender;
    public String intMembers;
    public String strCountry;
    public String strCountryCode;
    public String strArtistThumb;
    public String strArtistLogo;
    public String strArtistCutout;
    public String strArtistClearart;
    public String strArtistWideThumb;
    public String strArtistFanart;
    public String strArtistFanart2;
    public String strArtistFanart3;
    public String strArtistFanart4;
    public String strArtistBanner;
    public String strMusicBrainzID;
    public String strISNIcode;
    public String strLastFMChart;
    public String intCharted;
    public String strLocked;

    @Override
    public String toString() {
        return "Artist{" +
                "idArtist='" + idArtist + '\'' +
                ", strArtist='" + strArtist + '\'' +
                ", strArtistStripped='" + strArtistStripped + '\'' +
                ", strArtistAlternate='" + strArtistAlternate + '\'' +
                ", strLabel='" + strLabel + '\'' +
                ", idLabel='" + idLabel + '\'' +
                ", intFormedYear='" + intFormedYear + '\'' +
                ", intBornYear='" + intBornYear + '\'' +
                ", intDiedYear='" + intDiedYear + '\'' +
                ", strDisbanded='" + strDisbanded + '\'' +
                ", strStyle='" + strStyle + '\'' +
                ", strGenre='" + strGenre + '\'' +
                ", strMood='" + strMood + '\'' +
                ", strWebsite='" + strWebsite + '\'' +
                ", strFacebook='" + strFacebook + '\'' +
                ", strTwitter='" + strTwitter + '\'' +
                ", strBiographyEN='" + strBiographyEN + '\'' +
                ", strBiographyDE='" + strBiographyDE + '\'' +
                ", strBiographyFR='" + strBiographyFR + '\'' +
                ", strBiographyCN='" + strBiographyCN + '\'' +
                ", strBiographyIT='" + strBiographyIT + '\'' +
                ", strBiographyJP='" + strBiographyJP + '\'' +
                ", strBiographyRU='" + strBiographyRU + '\'' +
                ", strBiographyES='" + strBiographyES + '\'' +
                ", strBiographyPT='" + strBiographyPT + '\'' +
                ", strBiographySE='" + strBiographySE + '\'' +
                ", strBiographyNL='" + strBiographyNL + '\'' +
                ", strBiographyHU='" + strBiographyHU + '\'' +
                ", strBiographyNO='" + strBiographyNO + '\'' +
                ", strBiographyIL='" + strBiographyIL + '\'' +
                ", strBiographyPL='" + strBiographyPL + '\'' +
                ", strGender='" + strGender + '\'' +
                ", intMembers='" + intMembers + '\'' +
                ", strCountry='" + strCountry + '\'' +
                ", strCountryCode='" + strCountryCode + '\'' +
                ", strArtistThumb='" + strArtistThumb + '\'' +
                ", strArtistLogo='" + strArtistLogo + '\'' +
                ", strArtistCutout='" + strArtistCutout + '\'' +
                ", strArtistClearart='" + strArtistClearart + '\'' +
                ", strArtistWideThumb='" + strArtistWideThumb + '\'' +
                ", strArtistFanart='" + strArtistFanart + '\'' +
                ", strArtistFanart2='" + strArtistFanart2 + '\'' +
                ", strArtistFanart3='" + strArtistFanart3 + '\'' +
                ", strArtistFanart4='" + strArtistFanart4 + '\'' +
                ", strArtistBanner='" + strArtistBanner + '\'' +
                ", strMusicBrainzID='" + strMusicBrainzID + '\'' +
                ", strISNIcode='" + strISNIcode + '\'' +
                ", strLastFMChart='" + strLastFMChart + '\'' +
                ", intCharted='" + intCharted + '\'' +
                ", strLocked='" + strLocked + '\'' +
                '}';
    }
}

class BaseArtist{
    ArrayList<Artist> artists;
}