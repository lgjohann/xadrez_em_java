package com.johann.chess;

import com.johann.boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 1l;

    public ChessException(String message) {
        super(message);
    }
}
