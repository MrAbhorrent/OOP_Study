package com.study.gb.Seminar03.Service;

import com.study.gb.Seminar03.Comparator.SteamComporator;
import com.study.gb.Seminar03.Model.Stream;

import java.util.List;

public class SteamService {

    private List<Stream> steamList;

    public void setSteamList(List<Stream> steamList) {
        this.steamList = steamList;
    }

    public SteamService(List<Stream> steamList) {
        setSteamList(steamList);
    }

    public void sortSteamBySize() {
        steamList.sort(new SteamComporator());
    }
}
