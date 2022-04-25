package chess.dao;

import chess.dto.PieceAndPositionDto;

import java.util.List;

public interface ChessDao {

    void updateTurn(final String color, final int gameId);

    void deleteAllPiece(final int gameId);

    void savePiece(final int gameId, final PieceAndPositionDto pieceAndPositionDto);

    List<PieceAndPositionDto> findAllPiece(final int gameId);

    String findCurrentColor(final int gameId);

    void deletePiece(final int gameId, final String to);

    void updatePiece(final String from, final String to, final int gameId);

    void deleteGame(final int gameId);

    void initGame(final int gameId);
}