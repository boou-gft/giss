/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarConciliacaoApuracaoResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarConciliacaoApuracaoResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _numConsultas
     */
    private int _numConsultas = 0;

    /**
     * keeps track of state for field: _numConsultas
     */
    private boolean _has_numConsultas;

    /**
     * Field _sinalReceitaTotalCCRS
     */
    private java.lang.String _sinalReceitaTotalCCRS;

    /**
     * Field _valorReceitaTotalCCRS
     */
    private java.lang.String _valorReceitaTotalCCRS = "0";

    /**
     * Field _sinalReceitaTotalGISS
     */
    private java.lang.String _sinalReceitaTotalGISS;

    /**
     * Field _valorReceitaTotalGISS
     */
    private java.lang.String _valorReceitaTotalGISS = "0";

    /**
     * Field _sinalAjusteTotal
     */
    private java.lang.String _sinalAjusteTotal;

    /**
     * Field _valorAjusteTotal
     */
    private java.lang.String _valorAjusteTotal = "0";

    /**
     * Field _sinalIssTotal
     */
    private java.lang.String _sinalIssTotal;

    /**
     * Field _valorIssTotal
     */
    private java.lang.String _valorIssTotal = "0";

    /**
     * Field _sinalAliquotaZeradaTotal
     */
    private java.lang.String _sinalAliquotaZeradaTotal;

    /**
     * Field _valorAliquotaZeradaTotal
     */
    private java.lang.String _valorAliquotaZeradaTotal = "0";

    /**
     * Field _sinalOscilacaoNegativaTotal
     */
    private java.lang.String _sinalOscilacaoNegativaTotal;

    /**
     * Field _valorOscilacaoNegativaTotal
     */
    private java.lang.String _valorOscilacaoNegativaTotal = "0";

    /**
     * Field _sinalRedutorTotal
     */
    private java.lang.String _sinalRedutorTotal;

    /**
     * Field _valorRedutosTotal
     */
    private java.lang.String _valorRedutosTotal = "0";

    /**
     * Field _listaList
     */
    private java.util.Vector _listaList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarConciliacaoApuracaoResponse() 
     {
        super();
        setValorReceitaTotalCCRS("0");
        setValorReceitaTotalGISS("0");
        setValorAjusteTotal("0");
        setValorIssTotal("0");
        setValorAliquotaZeradaTotal("0");
        setValorOscilacaoNegativaTotal("0");
        setValorRedutosTotal("0");
        _listaList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.ListarConciliacaoApuracaoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLista
     * 
     * 
     * 
     * @param vLista
     */
    public void addLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 100");
        }
        _listaList.addElement(vLista);
    } //-- void addLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) 

    /**
     * Method addLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void addLista(int index, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        if (!(_listaList.size() < 100)) {
            throw new IndexOutOfBoundsException("addLista has a maximum of 100");
        }
        _listaList.insertElementAt(vLista, index);
    } //-- void addLista(int, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) 

    /**
     * Method deleteNumConsultas
     * 
     */
    public void deleteNumConsultas()
    {
        this._has_numConsultas= false;
    } //-- void deleteNumConsultas() 

    /**
     * Method enumerateLista
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLista()
    {
        return _listaList.elements();
    } //-- java.util.Enumeration enumerateLista() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Method getLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista getLista(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("getLista: Index value '"+index+"' not in range [0.."+(_listaList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) _listaList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista getLista(int) 

    /**
     * Method getLista
     * 
     * 
     * 
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista[] getLista()
    {
        int size = _listaList.size();
        br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) _listaList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista[] getLista() 

    /**
     * Method getListaCount
     * 
     * 
     * 
     * @return int
     */
    public int getListaCount()
    {
        return _listaList.size();
    } //-- int getListaCount() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'numConsultas'.
     * 
     * @return int
     * @return the value of field 'numConsultas'.
     */
    public int getNumConsultas()
    {
        return this._numConsultas;
    } //-- int getNumConsultas() 

    /**
     * Returns the value of field 'sinalAjusteTotal'.
     * 
     * @return String
     * @return the value of field 'sinalAjusteTotal'.
     */
    public java.lang.String getSinalAjusteTotal()
    {
        return this._sinalAjusteTotal;
    } //-- java.lang.String getSinalAjusteTotal() 

    /**
     * Returns the value of field 'sinalAliquotaZeradaTotal'.
     * 
     * @return String
     * @return the value of field 'sinalAliquotaZeradaTotal'.
     */
    public java.lang.String getSinalAliquotaZeradaTotal()
    {
        return this._sinalAliquotaZeradaTotal;
    } //-- java.lang.String getSinalAliquotaZeradaTotal() 

    /**
     * Returns the value of field 'sinalIssTotal'.
     * 
     * @return String
     * @return the value of field 'sinalIssTotal'.
     */
    public java.lang.String getSinalIssTotal()
    {
        return this._sinalIssTotal;
    } //-- java.lang.String getSinalIssTotal() 

    /**
     * Returns the value of field 'sinalOscilacaoNegativaTotal'.
     * 
     * @return String
     * @return the value of field 'sinalOscilacaoNegativaTotal'.
     */
    public java.lang.String getSinalOscilacaoNegativaTotal()
    {
        return this._sinalOscilacaoNegativaTotal;
    } //-- java.lang.String getSinalOscilacaoNegativaTotal() 

    /**
     * Returns the value of field 'sinalReceitaTotalCCRS'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaTotalCCRS'.
     */
    public java.lang.String getSinalReceitaTotalCCRS()
    {
        return this._sinalReceitaTotalCCRS;
    } //-- java.lang.String getSinalReceitaTotalCCRS() 

    /**
     * Returns the value of field 'sinalReceitaTotalGISS'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaTotalGISS'.
     */
    public java.lang.String getSinalReceitaTotalGISS()
    {
        return this._sinalReceitaTotalGISS;
    } //-- java.lang.String getSinalReceitaTotalGISS() 

    /**
     * Returns the value of field 'sinalRedutorTotal'.
     * 
     * @return String
     * @return the value of field 'sinalRedutorTotal'.
     */
    public java.lang.String getSinalRedutorTotal()
    {
        return this._sinalRedutorTotal;
    } //-- java.lang.String getSinalRedutorTotal() 

    /**
     * Returns the value of field 'valorAjusteTotal'.
     * 
     * @return String
     * @return the value of field 'valorAjusteTotal'.
     */
    public java.lang.String getValorAjusteTotal()
    {
        return this._valorAjusteTotal;
    } //-- java.lang.String getValorAjusteTotal() 

    /**
     * Returns the value of field 'valorAliquotaZeradaTotal'.
     * 
     * @return String
     * @return the value of field 'valorAliquotaZeradaTotal'.
     */
    public java.lang.String getValorAliquotaZeradaTotal()
    {
        return this._valorAliquotaZeradaTotal;
    } //-- java.lang.String getValorAliquotaZeradaTotal() 

    /**
     * Returns the value of field 'valorIssTotal'.
     * 
     * @return String
     * @return the value of field 'valorIssTotal'.
     */
    public java.lang.String getValorIssTotal()
    {
        return this._valorIssTotal;
    } //-- java.lang.String getValorIssTotal() 

    /**
     * Returns the value of field 'valorOscilacaoNegativaTotal'.
     * 
     * @return String
     * @return the value of field 'valorOscilacaoNegativaTotal'.
     */
    public java.lang.String getValorOscilacaoNegativaTotal()
    {
        return this._valorOscilacaoNegativaTotal;
    } //-- java.lang.String getValorOscilacaoNegativaTotal() 

    /**
     * Returns the value of field 'valorReceitaTotalCCRS'.
     * 
     * @return String
     * @return the value of field 'valorReceitaTotalCCRS'.
     */
    public java.lang.String getValorReceitaTotalCCRS()
    {
        return this._valorReceitaTotalCCRS;
    } //-- java.lang.String getValorReceitaTotalCCRS() 

    /**
     * Returns the value of field 'valorReceitaTotalGISS'.
     * 
     * @return String
     * @return the value of field 'valorReceitaTotalGISS'.
     */
    public java.lang.String getValorReceitaTotalGISS()
    {
        return this._valorReceitaTotalGISS;
    } //-- java.lang.String getValorReceitaTotalGISS() 

    /**
     * Returns the value of field 'valorRedutosTotal'.
     * 
     * @return String
     * @return the value of field 'valorRedutosTotal'.
     */
    public java.lang.String getValorRedutosTotal()
    {
        return this._valorRedutosTotal;
    } //-- java.lang.String getValorRedutosTotal() 

    /**
     * Method hasNumConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumConsultas()
    {
        return this._has_numConsultas;
    } //-- boolean hasNumConsultas() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllLista
     * 
     */
    public void removeAllLista()
    {
        _listaList.removeAllElements();
    } //-- void removeAllLista() 

    /**
     * Method removeLista
     * 
     * 
     * 
     * @param index
     * @return Lista
     */
    public br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista removeLista(int index)
    {
        java.lang.Object obj = _listaList.elementAt(index);
        _listaList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista removeLista(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Method setLista
     * 
     * 
     * 
     * @param index
     * @param vLista
     */
    public void setLista(int index, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista vLista)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _listaList.size())) {
            throw new IndexOutOfBoundsException("setLista: Index value '"+index+"' not in range [0.." + (_listaList.size() - 1) + "]");
        }
        if (!(index < 100)) {
            throw new IndexOutOfBoundsException("setLista has a maximum of 100");
        }
        _listaList.setElementAt(vLista, index);
    } //-- void setLista(int, br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) 

    /**
     * Method setLista
     * 
     * 
     * 
     * @param listaArray
     */
    public void setLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista[] listaArray)
    {
        //-- copy array
        _listaList.removeAllElements();
        for (int i = 0; i < listaArray.length; i++) {
            _listaList.addElement(listaArray[i]);
        }
    } //-- void setLista(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'numConsultas'.
     * 
     * @param numConsultas the value of field 'numConsultas'.
     */
    public void setNumConsultas(int numConsultas)
    {
        this._numConsultas = numConsultas;
        this._has_numConsultas = true;
    } //-- void setNumConsultas(int) 

    /**
     * Sets the value of field 'sinalAjusteTotal'.
     * 
     * @param sinalAjusteTotal the value of field 'sinalAjusteTotal'
     */
    public void setSinalAjusteTotal(java.lang.String sinalAjusteTotal)
    {
        this._sinalAjusteTotal = sinalAjusteTotal;
    } //-- void setSinalAjusteTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalAliquotaZeradaTotal'.
     * 
     * @param sinalAliquotaZeradaTotal the value of field
     * 'sinalAliquotaZeradaTotal'.
     */
    public void setSinalAliquotaZeradaTotal(java.lang.String sinalAliquotaZeradaTotal)
    {
        this._sinalAliquotaZeradaTotal = sinalAliquotaZeradaTotal;
    } //-- void setSinalAliquotaZeradaTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalIssTotal'.
     * 
     * @param sinalIssTotal the value of field 'sinalIssTotal'.
     */
    public void setSinalIssTotal(java.lang.String sinalIssTotal)
    {
        this._sinalIssTotal = sinalIssTotal;
    } //-- void setSinalIssTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalOscilacaoNegativaTotal'.
     * 
     * @param sinalOscilacaoNegativaTotal the value of field
     * 'sinalOscilacaoNegativaTotal'.
     */
    public void setSinalOscilacaoNegativaTotal(java.lang.String sinalOscilacaoNegativaTotal)
    {
        this._sinalOscilacaoNegativaTotal = sinalOscilacaoNegativaTotal;
    } //-- void setSinalOscilacaoNegativaTotal(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaTotalCCRS'.
     * 
     * @param sinalReceitaTotalCCRS the value of field
     * 'sinalReceitaTotalCCRS'.
     */
    public void setSinalReceitaTotalCCRS(java.lang.String sinalReceitaTotalCCRS)
    {
        this._sinalReceitaTotalCCRS = sinalReceitaTotalCCRS;
    } //-- void setSinalReceitaTotalCCRS(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaTotalGISS'.
     * 
     * @param sinalReceitaTotalGISS the value of field
     * 'sinalReceitaTotalGISS'.
     */
    public void setSinalReceitaTotalGISS(java.lang.String sinalReceitaTotalGISS)
    {
        this._sinalReceitaTotalGISS = sinalReceitaTotalGISS;
    } //-- void setSinalReceitaTotalGISS(java.lang.String) 

    /**
     * Sets the value of field 'sinalRedutorTotal'.
     * 
     * @param sinalRedutorTotal the value of field
     * 'sinalRedutorTotal'.
     */
    public void setSinalRedutorTotal(java.lang.String sinalRedutorTotal)
    {
        this._sinalRedutorTotal = sinalRedutorTotal;
    } //-- void setSinalRedutorTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorAjusteTotal'.
     * 
     * @param valorAjusteTotal the value of field 'valorAjusteTotal'
     */
    public void setValorAjusteTotal(java.lang.String valorAjusteTotal)
    {
        this._valorAjusteTotal = valorAjusteTotal;
    } //-- void setValorAjusteTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorAliquotaZeradaTotal'.
     * 
     * @param valorAliquotaZeradaTotal the value of field
     * 'valorAliquotaZeradaTotal'.
     */
    public void setValorAliquotaZeradaTotal(java.lang.String valorAliquotaZeradaTotal)
    {
        this._valorAliquotaZeradaTotal = valorAliquotaZeradaTotal;
    } //-- void setValorAliquotaZeradaTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorIssTotal'.
     * 
     * @param valorIssTotal the value of field 'valorIssTotal'.
     */
    public void setValorIssTotal(java.lang.String valorIssTotal)
    {
        this._valorIssTotal = valorIssTotal;
    } //-- void setValorIssTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorOscilacaoNegativaTotal'.
     * 
     * @param valorOscilacaoNegativaTotal the value of field
     * 'valorOscilacaoNegativaTotal'.
     */
    public void setValorOscilacaoNegativaTotal(java.lang.String valorOscilacaoNegativaTotal)
    {
        this._valorOscilacaoNegativaTotal = valorOscilacaoNegativaTotal;
    } //-- void setValorOscilacaoNegativaTotal(java.lang.String) 

    /**
     * Sets the value of field 'valorReceitaTotalCCRS'.
     * 
     * @param valorReceitaTotalCCRS the value of field
     * 'valorReceitaTotalCCRS'.
     */
    public void setValorReceitaTotalCCRS(java.lang.String valorReceitaTotalCCRS)
    {
        this._valorReceitaTotalCCRS = valorReceitaTotalCCRS;
    } //-- void setValorReceitaTotalCCRS(java.lang.String) 

    /**
     * Sets the value of field 'valorReceitaTotalGISS'.
     * 
     * @param valorReceitaTotalGISS the value of field
     * 'valorReceitaTotalGISS'.
     */
    public void setValorReceitaTotalGISS(java.lang.String valorReceitaTotalGISS)
    {
        this._valorReceitaTotalGISS = valorReceitaTotalGISS;
    } //-- void setValorReceitaTotalGISS(java.lang.String) 

    /**
     * Sets the value of field 'valorRedutosTotal'.
     * 
     * @param valorRedutosTotal the value of field
     * 'valorRedutosTotal'.
     */
    public void setValorRedutosTotal(java.lang.String valorRedutosTotal)
    {
        this._valorRedutosTotal = valorRedutosTotal;
    } //-- void setValorRedutosTotal(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarConciliacaoApuracaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.ListarConciliacaoApuracaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.ListarConciliacaoApuracaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.ListarConciliacaoApuracaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.ListarConciliacaoApuracaoResponse unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
