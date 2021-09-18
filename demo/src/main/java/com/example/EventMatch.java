package com.example;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/matches")
public class EventMatch {
    MatchesService matchesServis = new MatchesService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Match> getMatches(){
        return matchesServis.getAllMatches();   
    }


    @GET
    @Path("/{matchId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Match getMatch(@PathParam("matchId") long matchId ){
        return matchesServis.getMatch(matchId);
    }



    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Match addMatch (Match match){
            return matchesServis.addMatch(match);
    }

    @PUT
    @Path("/{matchId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Match updateMatch(@PathParam("matchId") long matchId,Match match){
        match.setId(matchId); 
        return matchesServis.updateMatch(match);
    }
    
}
