/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaMunicipiosEstadoManterRequest.java,v 1.3 2017/06/05 18:36:22 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListaMunicipiosEstadoManterRequest.
 * 
 * @version $Revision: 1.3 $ $Date: 2017/06/05 18:36:22 $
 */
public class ListaMunicipiosEstadoManterRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeRegistro
     */
    private int _qtdeRegistro = 0;

    /**
     * keeps track of state for field: _qtdeRegistro
     */
    private boolean _has_qtdeRegistro;

    /**
     * Field _codUF
     */
    private int _codUF = 0;

    /**
     * keeps track of state for field: _codUF
     */
    private boolean _has_codUF;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _tipoPesquisa
     */
    private int _tipoPesquisa = 0;

    /**
     * keeps track of state for field: _tipoPesquisa
     */
    private boolean _has_tipoPesquisa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaMunicipiosEstadoManterRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.request.ListaMunicipiosEstadoManterRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodUF
     * 
     */
    public void deleteCodUF()
    {
        this._has_codUF= false;
    } //-- void deleteCodUF() 

    /**
     * Method deleteQtdeRegistro
     * 
     */
    public void deleteQtdeRegistro()
    {
        this._has_qtdeRegistro= false;
    } //-- void deleteQtdeRegistro() 

    /**
     * Method deleteTipoPesquisa
     * 
     */
    public void deleteTipoPesquisa()
    {
        this._has_tipoPesquisa= false;
    } //-- void deleteTipoPesquisa() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codUF'.
     * 
     * @return int
     * @return the value of field 'codUF'.
     */
    public int getCodUF()
    {
        return this._codUF;
    } //-- int getCodUF() 

    /**
     * Returns the value of field 'qtdeRegistro'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistro'.
     */
    public int getQtdeRegistro()
    {
        return this._qtdeRegistro;
    } //-- int getQtdeRegistro() 

    /**
     * Returns the value of field 'tipoPesquisa'.
     * 
     * @return int
     * @return the value of field 'tipoPesquisa'.
     */
    public int getTipoPesquisa()
    {
        return this._tipoPesquisa;
    } //-- int getTipoPesquisa() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodUF
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUF()
    {
        return this._has_codUF;
    } //-- boolean hasCodUF() 

    /**
     * Method hasQtdeRegistro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistro()
    {
        return this._has_qtdeRegistro;
    } //-- boolean hasQtdeRegistro() 

    /**
     * Method hasTipoPesquisa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTipoPesquisa()
    {
        return this._has_tipoPesquisa;
    } //-- boolean hasTipoPesquisa() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codUF'.
     * 
     * @param codUF the value of field 'codUF'.
     */
    public void setCodUF(int codUF)
    {
        this._codUF = codUF;
        this._has_codUF = true;
    } //-- void setCodUF(int) 

    /**
     * Sets the value of field 'qtdeRegistro'.
     * 
     * @param qtdeRegistro the value of field 'qtdeRegistro'.
     */
    public void setQtdeRegistro(int qtdeRegistro)
    {
        this._qtdeRegistro = qtdeRegistro;
        this._has_qtdeRegistro = true;
    } //-- void setQtdeRegistro(int) 

    /**
     * Sets the value of field 'tipoPesquisa'.
     * 
     * @param tipoPesquisa the value of field 'tipoPesquisa'.
     */
    public void setTipoPesquisa(int tipoPesquisa)
    {
        this._tipoPesquisa = tipoPesquisa;
        this._has_tipoPesquisa = true;
    } //-- void setTipoPesquisa(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaMunicipiosEstadoManterRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.request.ListaMunicipiosEstadoManterRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.request.ListaMunicipiosEstadoManterRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.request.ListaMunicipiosEstadoManterRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.request.ListaMunicipiosEstadoManterRequest unmarshal(java.io.Reader) 

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
