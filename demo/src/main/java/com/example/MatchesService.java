package com.example;

import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;
import javax.swing.event.ListDataEvent;
import com.example.Match.Status;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MatchesService {


    private Map<Long,Match> matches = DatabaseClass.getMatches();

    public MatchesService(){
        matches.put(1L, new Match("Real Madrid vs Chelsea", "Football", Status.ended, "14/03/1999","14/03/2021", "Skopje", "Boris Trajkovski", "3:1",1));
    }

    public List<Match> getAllMatches(){

        return new ArrayList<Match>(matches.values());
    }

    public Match getMatch(long id){
        return matches.get(id);
    }

    public Match addMatch(Match match){
        match.setId(matches.size()+1);
        matches.put(match.getId(), match);
        return match;
    }

    public Match removeMatch(long id){
        return matches.remove(id);  
    }

    public Match updateMatch(Match match){
        if(match.getId() <= 0){
            return null;
        }
        matches.put(match.getId(), match);
        return match;
    }
    
}
