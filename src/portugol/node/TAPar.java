/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TAPar extends Token
{
    public TAPar()
    {
        super.setText("(");
    }

    public TAPar(int line, int pos)
    {
        super.setText("(");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAPar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAPar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAPar text.");
    }
}