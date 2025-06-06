/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response;

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
 * Class ListarDiferencasRetificadorContabilResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarDiferencasRetificadorContabilResponse implements java.io.Serializable {


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
     * Field _IEMPR
     */
    private java.lang.String _IEMPR;

    /**
     * Field _PRODUTO
     */
    private java.lang.String _PRODUTO;

    /**
     * Field _SITCONTABIL
     */
    private int _SITCONTABIL = 0;

    /**
     * keeps track of state for field: _SITCONTABIL
     */
    private boolean _has_SITCONTABIL;

    /**
     * Field _CFNALDARQISS
     */
    private int _CFNALDARQISS = 0;

    /**
     * keeps track of state for field: _CFNALDARQISS
     */
    private boolean _has_CFNALDARQISS;

    /**
     * Field _GISSWG0SQTDDEV
     */
    private int _GISSWG0SQTDDEV = 0;

    /**
     * keeps track of state for field: _GISSWG0SQTDDEV
     */
    private boolean _has_GISSWG0SQTDDEV;

    /**
     * Field _LISTAList
     */
    private java.util.Vector _LISTAList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDiferencasRetificadorContabilResponse() 
     {
        super();
        _LISTAList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.ListarDiferencasRetificadorContabilResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addLISTA
     * 
     * 
     * 
     * @param vLISTA
     */
    public void addLISTA(br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA vLISTA)
        throws java.lang.IndexOutOfBoundsException
    {
        _LISTAList.addElement(vLISTA);
    } //-- void addLISTA(br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) 

    /**
     * Method addLISTA
     * 
     * 
     * 
     * @param index
     * @param vLISTA
     */
    public void addLISTA(int index, br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA vLISTA)
        throws java.lang.IndexOutOfBoundsException
    {
        _LISTAList.insertElementAt(vLISTA, index);
    } //-- void addLISTA(int, br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) 

    /**
     * Method deleteCFNALDARQISS
     * 
     */
    public void deleteCFNALDARQISS()
    {
        this._has_CFNALDARQISS= false;
    } //-- void deleteCFNALDARQISS() 

    /**
     * Method deleteGISSWG0SQTDDEV
     * 
     */
    public void deleteGISSWG0SQTDDEV()
    {
        this._has_GISSWG0SQTDDEV= false;
    } //-- void deleteGISSWG0SQTDDEV() 

    /**
     * Method deleteSITCONTABIL
     * 
     */
    public void deleteSITCONTABIL()
    {
        this._has_SITCONTABIL= false;
    } //-- void deleteSITCONTABIL() 

    /**
     * Method enumerateLISTA
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateLISTA()
    {
        return _LISTAList.elements();
    } //-- java.util.Enumeration enumerateLISTA() 

    /**
     * Returns the value of field 'CFNALDARQISS'.
     * 
     * @return int
     * @return the value of field 'CFNALDARQISS'.
     */
    public int getCFNALDARQISS()
    {
        return this._CFNALDARQISS;
    } //-- int getCFNALDARQISS() 

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
     * Returns the value of field 'GISSWG0SQTDDEV'.
     * 
     * @return int
     * @return the value of field 'GISSWG0SQTDDEV'.
     */
    public int getGISSWG0SQTDDEV()
    {
        return this._GISSWG0SQTDDEV;
    } //-- int getGISSWG0SQTDDEV() 

    /**
     * Returns the value of field 'IEMPR'.
     * 
     * @return String
     * @return the value of field 'IEMPR'.
     */
    public java.lang.String getIEMPR()
    {
        return this._IEMPR;
    } //-- java.lang.String getIEMPR() 

    /**
     * Method getLISTA
     * 
     * 
     * 
     * @param index
     * @return LISTA
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA getLISTA(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _LISTAList.size())) {
            throw new IndexOutOfBoundsException("getLISTA: Index value '"+index+"' not in range [0.."+(_LISTAList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) _LISTAList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA getLISTA(int) 

    /**
     * Method getLISTA
     * 
     * 
     * 
     * @return LISTA
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA[] getLISTA()
    {
        int size = _LISTAList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) _LISTAList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA[] getLISTA() 

    /**
     * Method getLISTACount
     * 
     * 
     * 
     * @return int
     */
    public int getLISTACount()
    {
        return _LISTAList.size();
    } //-- int getLISTACount() 

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
     * Returns the value of field 'PRODUTO'.
     * 
     * @return String
     * @return the value of field 'PRODUTO'.
     */
    public java.lang.String getPRODUTO()
    {
        return this._PRODUTO;
    } //-- java.lang.String getPRODUTO() 

    /**
     * Returns the value of field 'SITCONTABIL'.
     * 
     * @return int
     * @return the value of field 'SITCONTABIL'.
     */
    public int getSITCONTABIL()
    {
        return this._SITCONTABIL;
    } //-- int getSITCONTABIL() 

    /**
     * Method hasCFNALDARQISS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCFNALDARQISS()
    {
        return this._has_CFNALDARQISS;
    } //-- boolean hasCFNALDARQISS() 

    /**
     * Method hasGISSWG0SQTDDEV
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGISSWG0SQTDDEV()
    {
        return this._has_GISSWG0SQTDDEV;
    } //-- boolean hasGISSWG0SQTDDEV() 

    /**
     * Method hasSITCONTABIL
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSITCONTABIL()
    {
        return this._has_SITCONTABIL;
    } //-- boolean hasSITCONTABIL() 

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
     * Method removeAllLISTA
     * 
     */
    public void removeAllLISTA()
    {
        _LISTAList.removeAllElements();
    } //-- void removeAllLISTA() 

    /**
     * Method removeLISTA
     * 
     * 
     * 
     * @param index
     * @return LISTA
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA removeLISTA(int index)
    {
        java.lang.Object obj = _LISTAList.elementAt(index);
        _LISTAList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA removeLISTA(int) 

    /**
     * Sets the value of field 'CFNALDARQISS'.
     * 
     * @param CFNALDARQISS the value of field 'CFNALDARQISS'.
     */
    public void setCFNALDARQISS(int CFNALDARQISS)
    {
        this._CFNALDARQISS = CFNALDARQISS;
        this._has_CFNALDARQISS = true;
    } //-- void setCFNALDARQISS(int) 

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
     * Sets the value of field 'GISSWG0SQTDDEV'.
     * 
     * @param GISSWG0SQTDDEV the value of field 'GISSWG0SQTDDEV'.
     */
    public void setGISSWG0SQTDDEV(int GISSWG0SQTDDEV)
    {
        this._GISSWG0SQTDDEV = GISSWG0SQTDDEV;
        this._has_GISSWG0SQTDDEV = true;
    } //-- void setGISSWG0SQTDDEV(int) 

    /**
     * Sets the value of field 'IEMPR'.
     * 
     * @param IEMPR the value of field 'IEMPR'.
     */
    public void setIEMPR(java.lang.String IEMPR)
    {
        this._IEMPR = IEMPR;
    } //-- void setIEMPR(java.lang.String) 

    /**
     * Method setLISTA
     * 
     * 
     * 
     * @param index
     * @param vLISTA
     */
    public void setLISTA(int index, br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA vLISTA)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _LISTAList.size())) {
            throw new IndexOutOfBoundsException("setLISTA: Index value '"+index+"' not in range [0.." + (_LISTAList.size() - 1) + "]");
        }
        _LISTAList.setElementAt(vLISTA, index);
    } //-- void setLISTA(int, br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) 

    /**
     * Method setLISTA
     * 
     * 
     * 
     * @param LISTAArray
     */
    public void setLISTA(br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA[] LISTAArray)
    {
        //-- copy array
        _LISTAList.removeAllElements();
        for (int i = 0; i < LISTAArray.length; i++) {
            _LISTAList.addElement(LISTAArray[i]);
        }
    } //-- void setLISTA(br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.LISTA) 

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
     * Sets the value of field 'PRODUTO'.
     * 
     * @param PRODUTO the value of field 'PRODUTO'.
     */
    public void setPRODUTO(java.lang.String PRODUTO)
    {
        this._PRODUTO = PRODUTO;
    } //-- void setPRODUTO(java.lang.String) 

    /**
     * Sets the value of field 'SITCONTABIL'.
     * 
     * @param SITCONTABIL the value of field 'SITCONTABIL'.
     */
    public void setSITCONTABIL(int SITCONTABIL)
    {
        this._SITCONTABIL = SITCONTABIL;
        this._has_SITCONTABIL = true;
    } //-- void setSITCONTABIL(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDiferencasRetificadorContabilResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.ListarDiferencasRetificadorContabilResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.ListarDiferencasRetificadorContabilResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.ListarDiferencasRetificadorContabilResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.response.ListarDiferencasRetificadorContabilResponse unmarshal(java.io.Reader) 

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
