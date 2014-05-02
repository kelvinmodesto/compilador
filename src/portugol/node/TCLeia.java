/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCLeia extends Token
{
    public TCLeia()
    {
        super.setText("leia");
    }

    public TCLeia(int line, int pos)
    {
        super.setText("leia");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCLeia(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCLeia(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCLeia text.");
    }
}