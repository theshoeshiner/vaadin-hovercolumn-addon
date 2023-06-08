package org.vaadin.addons.hovercolumn;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;

@SuppressWarnings("serial")
@CssImport(value="show-on-hover-column.css")
@CssImport(value = "show-on-hover-column-vaadin-grid.css",themeFor = "vaadin-grid")
public class HoverColumn extends Component {

	/**
	 * Applying this class to a column via com.vaadin.flow.component.grid.Grid.Column.setClassNameGenerator() will hide the contents 
	 * of the column unless the row is being hovered over
	 */
	public static final String HOVER_COLUMN_CLASS = "show-on-hover";
	
	/**
	 * Applying this class to a component will force the component to be visible even if it is within a hidden column
	 */
	public static final String HOVER_COLUMN_EXCLUDE_CLASS = "show-on-hover-exclude";

}
