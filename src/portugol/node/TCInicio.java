/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TCInicio extends Token
{
    public TCInicio()
    {
        super.setText("inicio");
    }

    public TCInicio(int line, int pos)
    {
        super.setText("inicio");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCInicio(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCInicio(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCInicio text.");
    }
}
