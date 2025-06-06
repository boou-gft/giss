/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListaHistoricoItemLei.
 * 
 * @version $Revision$ $Date$
 */
public class ListaHistoricoItemLei implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemLei
     */
    private int _codItemLei = 0;

    /**
     * keeps track of state for field: _codItemLei
     */
    private boolean _has_codItemLei;

    /**
     * Field _descItemLei
     */
    private java.lang.String _descItemLei;

    /**
     * Field _status
     */
    private java.lang.String _status;

    /**
     * Field _codUsuarioManutencao
     */
    private java.lang.String _codUsuarioManutencao;

    /**
     * Field _dataHoraManutencao
     */
    private java.lang.String _dataHoraManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaHistoricoItemLei() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLei
     * 
     */
    public void deleteCodItemLei()
    {
        this._has_codItemLei= false;
    } //-- void deleteCodItemLei() 

    /**
     * Returns the value of field 'codItemLei'.
     * 
     * @return int
     * @return the value of field 'codItemLei'.
     */
    public int getCodItemLei()
    {
        return this._codItemLei;
    } //-- int getCodItemLei() 

    /**
     * Returns the value of field 'codUsuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManutencao'.
     */
    public java.lang.String getCodUsuarioManutencao()
    {
        return this._codUsuarioManutencao;
    } //-- java.lang.String getCodUsuarioManutencao() 

    /**
     * Returns the value of field 'dataHoraManutencao'.
     * 
     * @return String
     * @return the value of field 'dataHoraManutencao'.
     */
    public java.lang.String getDataHoraManutencao()
    {
        return this._dataHoraManutencao;
    } //-- java.lang.String getDataHoraManutencao() 

    /**
     * Returns the value of field 'descItemLei'.
     * 
     * @return String
     * @return the value of field 'descItemLei'.
     */
    public java.lang.String getDescItemLei()
    {
        return this._descItemLei;
    } //-- java.lang.String getDescItemLei() 

    /**
     * Returns the value of field 'status'.
     * 
     * @return String
     * @return the value of field 'status'.
     */
    public java.lang.String getStatus()
    {
        return this._status;
    } //-- java.lang.String getStatus() 

    /**
     * Method hasCodItemLei
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLei()
    {
        return this._has_codItemLei;
    } //-- boolean hasCodItemLei() 

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
     * Sets the value of field 'codItemLei'.
     * 
     * @param codItemLei the value of field 'codItemLei'.
     */
    public void setCodItemLei(int codItemLei)
    {
        this._codItemLei = codItemLei;
        this._has_codItemLei = true;
    } //-- void setCodItemLei(int) 

    /**
     * Sets the value of field 'codUsuarioManutencao'.
     * 
     * @param codUsuarioManutencao the value of field
     * 'codUsuarioManutencao'.
     */
    public void setCodUsuarioManutencao(java.lang.String codUsuarioManutencao)
    {
        this._codUsuarioManutencao = codUsuarioManutencao;
    } //-- void setCodUsuarioManutencao(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraManutencao'.
     * 
     * @param dataHoraManutencao the value of field
     * 'dataHoraManutencao'.
     */
    public void setDataHoraManutencao(java.lang.String dataHoraManutencao)
    {
        this._dataHoraManutencao = dataHoraManutencao;
    } //-- void setDataHoraManutencao(java.lang.String) 

    /**
     * Sets the value of field 'descItemLei'.
     * 
     * @param descItemLei the value of field 'descItemLei'.
     */
    public void setDescItemLei(java.lang.String descItemLei)
    {
        this._descItemLei = descItemLei;
    } //-- void setDescItemLei(java.lang.String) 

    /**
     * Sets the value of field 'status'.
     * 
     * @param status the value of field 'status'.
     */
    public void setStatus(java.lang.String status)
    {
        this._status = status;
    } //-- void setStatus(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaHistoricoItemLei
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.response.ListaHistoricoItemLei unmarshal(java.io.Reader) 

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
