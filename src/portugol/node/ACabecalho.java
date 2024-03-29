/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ACabecalho extends PCabecalho
{
    private TCPrograma _cPrograma_;
    private TId _id_;
    private TCInicio _cInicio_;

    public ACabecalho()
    {
        // Constructor
    }

    public ACabecalho(
        @SuppressWarnings("hiding") TCPrograma _cPrograma_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TCInicio _cInicio_)
    {
        // Constructor
        setCPrograma(_cPrograma_);

        setId(_id_);

        setCInicio(_cInicio_);

    }

    @Override
    public Object clone()
    {
        return new ACabecalho(
            cloneNode(this._cPrograma_),
            cloneNode(this._id_),
            cloneNode(this._cInicio_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACabecalho(this);
    }

    public TCPrograma getCPrograma()
    {
        return this._cPrograma_;
    }

    public void setCPrograma(TCPrograma node)
    {
        if(this._cPrograma_ != null)
        {
            this._cPrograma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cPrograma_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TCInicio getCInicio()
    {
        return this._cInicio_;
    }

    public void setCInicio(TCInicio node)
    {
        if(this._cInicio_ != null)
        {
            this._cInicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cInicio_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cPrograma_)
            + toString(this._id_)
            + toString(this._cInicio_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cPrograma_ == child)
        {
            this._cPrograma_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._cInicio_ == child)
        {
            this._cInicio_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cPrograma_ == oldChild)
        {
            setCPrograma((TCPrograma) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._cInicio_ == oldChild)
        {
            setCInicio((TCInicio) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
