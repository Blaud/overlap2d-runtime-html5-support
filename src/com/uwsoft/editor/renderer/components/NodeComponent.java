package com.uwsoft.editor.renderer.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.SnapshotArray;

public class NodeComponent implements Component {
	public Array<Entity> children = new Array<Entity>();

	public void removeChild(Entity entity) {
		children.removeValue(entity, false);
	}

	public void addChild(Entity entity) {
		children.add(entity);
	}
}
