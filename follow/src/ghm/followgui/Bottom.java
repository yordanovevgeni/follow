/* 
Copyright (C) 2000-2003 Greg Merrill (greghmerrill@yahoo.com)

This file is part of Follow (http://follow.sf.net).

Follow is free software; you can redistribute it and/or modify
it under the terms of version 2 of the GNU General Public
License as published by the Free Software Foundation.

Follow is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Follow; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package ghm.followgui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JViewport;

/**
Action which jumps to the last line of the currently followed file.
@author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
*/
class Bottom extends FollowAppAction {
  
  Bottom (FollowApp app) {
    super(
      app, 
      app.resBundle_.getString("action.Bottom.name"),
      app.resBundle_.getString("action.Bottom.mnemonic"),
      app.resBundle_.getString("action.Bottom.accelerator"),
      app.resBundle_.getString("action.Bottom.icon")
    );    
  }

  public void actionPerformed (ActionEvent e) {
    FileFollowingPane fileFollowingPane = app_.getSelectedFileFollowingPane();
    JTextArea textArea = fileFollowingPane.getTextArea();
    textArea.setCaretPosition(textArea.getDocument().getLength());
    JViewport viewport = fileFollowingPane.getViewport();
    int y = (int)(
      viewport.getViewSize().getHeight() - viewport.getExtentSize().getHeight()
    );
    Point bottomPosition = new Point(0, y);
    viewport.setViewPosition(bottomPosition);
    viewport.revalidate();
  }

}

