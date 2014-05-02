/* This file was generated by SableCC (http://www.sablecc.org/). */

package src.portugol.node;

import src.portugol.analysis.*;

@SuppressWarnings("nls")
public final class TFComentarioAninhado extends Token
{
    public TFComentarioAninhado(String text)
    {
        setText(text);
    }

    public TFComentarioAninhado(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFComentarioAninhado(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFComentarioAninhado(this);
    }
}
