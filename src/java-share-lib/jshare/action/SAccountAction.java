
/*
 * @copyright
 *
 *  Copyright 2015 Neo Natura 
 *
 *  This file is part of the Share Library.
 *  (https://github.com/neonatura/share)
 *        
 *  The Share Library is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version. 
 *
 *  The Share Library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with The Share Library.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  @endcopyright
 */
package jshare.action;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import jshare.gui.*;
import jshare.gui.panel.*;
import jshare.gui.menu.*;

public class SAccountAction extends SAction
{


  public SAccountAction()
  {

    setName("Account");
    setDesc("Manage account information.");

  }

/*
  public void runFgTask(String cmd, SPanel c)
  {
  }
*/

  public void runBgTask(String cmd, SPanel c)
  {
    System.out.println("DEBUG: System.runBgTask[" + cmd + "]: " + c);
  }

  public void runFgTask(String cmd, SPanel c)
  {
/*
    SMenuPanel p = (SMenuPanel)c;
    super.runFgTask(cmd, c);
*/

    System.out.println("DEBUG: System.runFgTask[" + cmd + "]:");



  }

}
