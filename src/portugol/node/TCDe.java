/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCDe extends Token
{
    public TCDe()
    {
        super.setText("de");
    }

    public TCDe(int line, int pos)
    {
        super.setText("de");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCDe(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCDe(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCDe text.");
    }
}
