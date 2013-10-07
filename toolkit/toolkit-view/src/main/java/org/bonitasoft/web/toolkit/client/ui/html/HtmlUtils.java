/*
 * Copyright (C) 2013 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.bonitasoft.web.toolkit.client.ui.html;

import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtml;

/**
 * Created by Vincent Elcrin
 * Date: 07/10/13
 * Time: 16:27
 */
public class HtmlUtils {

    /**
     * Replace all variables occurrence in the element's html. Variables are tokens delimited by %%.
     *
     * <pre class="code">{@code
     * SpanElement el = new SpanElement("<span>%variable-name% has been replaced</span>");
     * HtmlUtils.replaceVariable(el, "variable-name", "someValue");
     * }</pre>
     * Result: someValue has been replaced
     *
     * @param el the element which contains the html with variables
     * @param name the name of the variable. This is the token contained between %%
     * @param value the value which will replace the variable
     */
    public static void replaceVariable(Element el, String name, SafeHtml value) {
        el.setInnerHTML(el.getInnerHTML().replaceAll("%" + name + "%", value.asString()));
    }
}
