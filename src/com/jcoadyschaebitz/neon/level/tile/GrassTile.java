package com.jcoadyschaebitz.neon.level.tile;

import com.jcoadyschaebitz.neon.graphics.Screen;
import com.jcoadyschaebitz.neon.graphics.Sprite;
import com.jcoadyschaebitz.neon.level.Level;

public class GrassTile extends Tile {

	public GrassTile(Sprite sprite, int colour) {
		super(sprite, colour, false, 0);
	}
	
	public GrassTile(Sprite sprite) {
		super(sprite, 0, false, 0);
	}

	public void render(int x, int y, Screen screen, Level level, long seed) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
